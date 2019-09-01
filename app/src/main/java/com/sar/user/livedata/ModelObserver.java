package com.sar.user.livedata;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.util.Log;

import java.util.Random;

public class ModelObserver extends ViewModel {

  public MutableLiveData<String> a;
   public MutableLiveData<String> getnumber()
   {
      if(a==null)
      {
          a=new MutableLiveData<>();
      createnumber();
      }
       return a;
   }
   public void createnumber()
   {
       Random random=new Random();
       a.setValue(String.valueOf(random.nextInt(9)-1));

   }

    /**
     * This method will be called when this ViewModel is no longer used and will be destroyed.
     * <p>
     * It is useful when ViewModel observes some data and you need to clear this subscription to
     * prevent a leak of this ViewModel.
     */
    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i("jj","ok");
    }
}
