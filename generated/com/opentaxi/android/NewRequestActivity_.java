//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.2.
//


package com.opentaxi.android;

import java.io.Serializable;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import com.opentaxi.android.R.id;
import com.opentaxi.android.R.layout;
import com.opentaxi.models.NewRequestDetails;
import com.stil.generated.mysql.tables.pojos.Cars;
import com.stil.generated.mysql.tables.pojos.Contactaddress;
import com.stil.generated.mysql.tables.pojos.Groups;
import com.stil.generated.mysql.tables.pojos.Regions;
import org.androidannotations.api.BackgroundExecutor;
import org.androidannotations.api.builder.ActivityIntentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class NewRequestActivity_
    extends NewRequestActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    public final static String CARS_EXTRA = "cars";
    private Handler handler_ = new Handler(Looper.getMainLooper());

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.new_request);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        injectExtras_();
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static NewRequestActivity_.IntentBuilder_ intent(Context context) {
        return new NewRequestActivity_.IntentBuilder_(context);
    }

    public static NewRequestActivity_.IntentBuilder_ intent(Fragment supportFragment) {
        return new NewRequestActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        reqInfoButtonContainer = ((LinearLayout) hasViews.findViewById(id.reqInfoButtonContainer));
        llFilters = ((LinearLayout) hasViews.findViewById(id.llFilters));
        citiesPicker = ((AutoCompleteTextView) hasViews.findViewById(id.citiesPicker));
        region = ((TextView) hasViews.findViewById(id.region));
        destination = ((AutoCompleteTextView) hasViews.findViewById(id.destination));
        address = ((TextView) hasViews.findViewById(id.address));
        destLayout = ((LinearLayout) hasViews.findViewById(id.destLayout));
        addressChange = ((Button) hasViews.findViewById(id.addressChange));
        requestSend = ((Button) hasViews.findViewById(id.requestSend));
        regionsPicker = ((AutoCompleteTextView) hasViews.findViewById(id.regionsPicker));
        addressText = ((EditText) hasViews.findViewById(id.addressText));
        pbProgress = ((ProgressBar) hasViews.findViewById(id.pbProgress));
        regionsLayout = ((LinearLayout) hasViews.findViewById(id.regionsLayout));
        pricesPicker = ((Spinner) hasViews.findViewById(id.pricesPicker));
        {
            View view = hasViews.findViewById(id.addressImage);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        NewRequestActivity_.this.addressImage();
                    }

                }
                );
            }
        }
        if (requestSend!= null) {
            requestSend.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    NewRequestActivity_.this.requestSend();
                }

            }
            );
        }
        if (addressChange!= null) {
            addressChange.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    NewRequestActivity_.this.addressChange();
                }

            }
            );
        }
        afterActivity();
    }

    private void injectExtras_() {
        Bundle extras_ = getIntent().getExtras();
        if (extras_!= null) {
            if (extras_.containsKey(CARS_EXTRA)) {
                cars = ((Cars) extras_.getSerializable(CARS_EXTRA));
            }
        }
    }

    @Override
    public void setIntent(Intent newIntent) {
        super.setIntent(newIntent);
        injectExtras_();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case  999 :
                NewRequestActivity_.this.onResult(resultCode, data);
                break;
        }
    }

    @Override
    public void showPrices(final Groups[] prices) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                NewRequestActivity_.super.showPrices(prices);
            }

        }
        );
    }

    @Override
    public void showAddress(final String city, final String region, final String adr) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                NewRequestActivity_.super.showAddress(city, region, adr);
            }

        }
        );
    }

    @Override
    public void SuccessDialog() {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                NewRequestActivity_.super.SuccessDialog();
            }

        }
        );
    }

    @Override
    public void showCities(final Contactaddress contactAddress) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                NewRequestActivity_.super.showCities(contactAddress);
            }

        }
        );
    }

    @Override
    public void showGroups(final Groups[] groups) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                NewRequestActivity_.super.showGroups(groups);
            }

        }
        );
    }

    @Override
    public void ErrorDialog() {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                NewRequestActivity_.super.ErrorDialog();
            }

        }
        );
    }

    @Override
    public void showRegions(final Regions[] regions) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                NewRequestActivity_.super.showRegions(regions);
            }

        }
        );
    }

    @Override
    public void setAddress(final Location location) {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    NewRequestActivity_.super.setAddress(location);
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void setGroups() {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    NewRequestActivity_.super.setGroups();
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void setPrices() {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    NewRequestActivity_.super.setPrices();
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void sendRequest(final NewRequestDetails newRequest) {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    NewRequestActivity_.super.sendRequest(newRequest);
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void setCities() {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    NewRequestActivity_.super.setCities();
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    public static class IntentBuilder_
        extends ActivityIntentBuilder<NewRequestActivity_.IntentBuilder_>
    {

        private Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, NewRequestActivity_.class);
        }

        public IntentBuilder_(Fragment fragment) {
            super(fragment.getActivity(), NewRequestActivity_.class);
            fragmentSupport_ = fragment;
        }

        @Override
        public void startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent, requestCode);
            } else {
                super.startForResult(requestCode);
            }
        }

        public NewRequestActivity_.IntentBuilder_ cars(Cars cars) {
            return super.extra(CARS_EXTRA, ((Serializable) cars));
        }

    }

}
