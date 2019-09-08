package com.neighborcell.azurewrath;

import android.app.*;
import android.os.*;
import com.neighborcell.recollection.*;

public class MainActivity extends Activity 
{
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    RecLog.debug();
  }
}
