package ru.test.example;

import android.content.Context;

/**
 * DON'T MODIFY THIS FILE - old ver
 */
public class Loader
{
    private Context context;

    private boolean is_finish = false;

    public Loader(Context context)
    {
        this.context = context;
    }

    public void load()
    {
        this.is_finish = true;
    }

    public boolean isFinish()
    {
        return this.is_finish;
    }
}
