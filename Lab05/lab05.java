import java.lang.Math;

public class lab05
{
    public static void main(String[] args) 
    {
        int size_x = Integer.parseInt(args[0]);
        int size_y = Integer.parseInt(args[1]);
        int steps = Integer.parseInt(args[2]);
        int preset = Integer.parseInt(args[3]);

        gra_w_zycie(size_x, size_y, steps, preset);
    }

    public static void gra_w_zycie(int size_x, int size_y, int steps, int preset)
    {
        int[][] current = new int[size_y][size_x];
        int[][] next = new int[size_y][size_x];

        if(preset == 0)
        {
            for(int y = 0; y < size_y; y++)
            {
                for(int x = 0; x < size_x; x++)
                {
                    current[y][x] = Math.round((float)Math.random());
                    next[y][x] = 0;
                }
            }
        }

        if(preset == 1)
        {
            for(int y = 0; y < size_y; y++)
            {
                for(int x = 0; x < size_x; x++)
                {
                    current[y][x] = 0;
                    next[y][x] = 0;
                }
            }  
            current[size_y/2][size_x/2 - 1] = 1;
            current[size_y/2][size_x/2 + 1] = 1;
            current[size_y/2 - 1][size_x/2] = 1;
            current[size_y/2 + 1][size_x/2] = 1;
            current[size_y/2 - 1][size_x/2 - 1] = 1;  
        }

        if(preset == 2)
        {
            for(int y = 0; y < size_y; y++)
            {
                for(int x = 0; x < size_x; x++)
                {
                    current[y][x] = 0;
                    next[y][x] = 0;
                }
            }  
            current[size_y/2 - 1][size_x/2] = 1;
            current[size_y/2][size_x/2] = 1;
            current[size_y/2 + 1][size_x/2] = 1;
        }

        if(preset == 3)
        {
            for(int y = 0; y < size_y; y++)
            {
                for(int x = 0; x < size_x; x++)
                {
                    current[y][x] = 0;
                    next[y][x] = 0;
                }
            }  
            current[size_y/2 + 1][size_x/2] = 1;
            current[size_y/2][size_x/2 - 1] = 1;
            current[size_y/2 - 1][size_x/2] = 1;
            current[size_y/2 - 1][size_x/2 - 1] = 1;
            current[size_y/2 - 1][size_x/2 + 1] = 1;
        }

        int neighbours;

        for(int step = 0; step < steps; step++)
        {
            for(int y = 0; y < size_y; y++)
            {
                for(int x = 0; x < size_x; x++)
                {
                    neighbours = 0;

                    for(int vertical = -1; vertical < 2; vertical++)
                    {
                        for(int horizontal = -1; horizontal < 2; horizontal++)
                        {
                            if(current[(((vertical + y) % size_y) + size_y)%size_y][(((horizontal + x)% size_x) + size_x)%size_x] == 1)
                            {
                                if(!(horizontal == 0 && vertical == 0))
                                {
                                    neighbours++;
                                }

                                if(current[y][x] == 1)
                                {
                                    if(neighbours == 2 || neighbours == 3)
                                    {
                                        next[y][x] = 1;
                                    }
                                    else
                                    {
                                       next[y][x] = 0;
                                    }
                                }

                                if(current[y][x] == 0)
                                {
                                    if(neighbours == 3)
                                    {
                                        next[y][x] = 1;
                                    }
                                    else
                                    {
                                        next[y][x] = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            for(int y = 0; y < size_y; y++)
            {
                if(y == size_y/2)
                {
                    System.out.print((step + 1) + " ");
                }
                else
                {
                    System.out.print("- ");
                }
            }
            System.out.println();
                    
            for(int y = 0; y < size_y; y++)
            {
                for(int x = 0; x < size_x; x++)
                {
                    if(current[y][x] == 1)
                    {
                        System.out.print("X ");
                    }
                    else
                    {
                        System.out.print(". ");
                    }
                    current[y][x] = next[y][x];
                }
                System.out.println();
            }
        }
    }
}