package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSideMenuBindingImpl extends FragmentSideMenuBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.side_options, 16);
        sViewsWithIds.put(R.id.divider, 17);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSideMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private FragmentSideMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[14]
            , (android.view.View) bindings[17]
            , (android.widget.Button) bindings[15]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.RadioButton) bindings[7]
            , (android.widget.RadioButton) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.RadioButton) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.RadioGroup) bindings[16]
            , (android.widget.RadioButton) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[13]
            );
        this.cancelButton.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.nextButton.setTag(null);
        this.potatoDescription.setTag(null);
        this.potatoPrice.setTag(null);
        this.potatoes.setTag(null);
        this.rice.setTag(null);
        this.riceDescription.setTag(null);
        this.ricePrice.setTag(null);
        this.salad.setTag(null);
        this.saladDescription.setTag(null);
        this.saladPrice.setTag(null);
        this.soup.setTag(null);
        this.soupDescription.setTag(null);
        this.soupPrice.setTag(null);
        this.subtotal.setTag(null);
        setRootTag(root);
        // listeners
        mCallback11 = new com.example.lunchtray.generated.callback.OnClickListener(this, 5);
        mCallback12 = new com.example.lunchtray.generated.callback.OnClickListener(this, 6);
        mCallback9 = new com.example.lunchtray.generated.callback.OnClickListener(this, 3);
        mCallback8 = new com.example.lunchtray.generated.callback.OnClickListener(this, 2);
        mCallback10 = new com.example.lunchtray.generated.callback.OnClickListener(this, 4);
        mCallback7 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.sideMenuFragment == variableId) {
            setSideMenuFragment((com.example.lunchtray.ui.order.SideMenuFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.lunchtray.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSideMenuFragment(@Nullable com.example.lunchtray.ui.order.SideMenuFragment SideMenuFragment) {
        this.mSideMenuFragment = SideMenuFragment;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.sideMenuFragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.example.lunchtray.model.OrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSubtotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSubtotal(androidx.lifecycle.LiveData<java.lang.String> ViewModelSubtotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.LiveData<java.lang.String> viewModelSubtotal = null;
        java.lang.String viewModelMenuItemsSoupName = null;
        com.example.lunchtray.ui.order.SideMenuFragment sideMenuFragment = mSideMenuFragment;
        java.util.Map<java.lang.String,com.example.lunchtray.model.MenuItem> viewModelMenuItems = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsSoup = null;
        java.lang.String viewModelMenuItemsSoupGetFormattedPrice = null;
        java.lang.String viewModelMenuItemsPotatoesDescription = null;
        java.lang.String viewModelMenuItemsSoupDescription = null;
        java.lang.String viewModelMenuItemsPotatoesName = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsPotatoes = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsSalad = null;
        java.lang.String viewModelMenuItemsRiceDescription = null;
        java.lang.String viewModelMenuItemsRiceName = null;
        java.lang.String viewModelSubtotalGetValue = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsRice = null;
        java.lang.String viewModelMenuItemsSaladDescription = null;
        java.lang.String viewModelMenuItemsSaladName = null;
        java.lang.String viewModelMenuItemsPotatoesGetFormattedPrice = null;
        java.lang.String viewModelMenuItemsSaladGetFormattedPrice = null;
        com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
        java.lang.String viewModelMenuItemsRiceGetFormattedPrice = null;

        if ((dirtyFlags & 0xdL) != 0) {



                if (viewModel != null) {
                    // read viewModel.subtotal
                    viewModelSubtotal = viewModel.getSubtotal();
                }
                updateLiveDataRegistration(0, viewModelSubtotal);


                if (viewModelSubtotal != null) {
                    // read viewModel.subtotal.getValue()
                    viewModelSubtotalGetValue = viewModelSubtotal.getValue();
                }
            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.menuItems
                        viewModelMenuItems = viewModel.getMenuItems();
                    }


                    if (viewModelMenuItems != null) {
                        // read viewModel.menuItems["soup"]
                        viewModelMenuItemsSoup = viewModelMenuItems.get("soup");
                        // read viewModel.menuItems["potatoes"]
                        viewModelMenuItemsPotatoes = viewModelMenuItems.get("potatoes");
                        // read viewModel.menuItems["salad"]
                        viewModelMenuItemsSalad = viewModelMenuItems.get("salad");
                        // read viewModel.menuItems["rice"]
                        viewModelMenuItemsRice = viewModelMenuItems.get("rice");
                    }


                    if (viewModelMenuItemsSoup != null) {
                        // read viewModel.menuItems["soup"].name
                        viewModelMenuItemsSoupName = viewModelMenuItemsSoup.getName();
                        // read viewModel.menuItems["soup"].getFormattedPrice()
                        viewModelMenuItemsSoupGetFormattedPrice = viewModelMenuItemsSoup.getFormattedPrice();
                        // read viewModel.menuItems["soup"].description
                        viewModelMenuItemsSoupDescription = viewModelMenuItemsSoup.getDescription();
                    }
                    if (viewModelMenuItemsPotatoes != null) {
                        // read viewModel.menuItems["potatoes"].description
                        viewModelMenuItemsPotatoesDescription = viewModelMenuItemsPotatoes.getDescription();
                        // read viewModel.menuItems["potatoes"].name
                        viewModelMenuItemsPotatoesName = viewModelMenuItemsPotatoes.getName();
                        // read viewModel.menuItems["potatoes"].getFormattedPrice()
                        viewModelMenuItemsPotatoesGetFormattedPrice = viewModelMenuItemsPotatoes.getFormattedPrice();
                    }
                    if (viewModelMenuItemsSalad != null) {
                        // read viewModel.menuItems["salad"].description
                        viewModelMenuItemsSaladDescription = viewModelMenuItemsSalad.getDescription();
                        // read viewModel.menuItems["salad"].name
                        viewModelMenuItemsSaladName = viewModelMenuItemsSalad.getName();
                        // read viewModel.menuItems["salad"].getFormattedPrice()
                        viewModelMenuItemsSaladGetFormattedPrice = viewModelMenuItemsSalad.getFormattedPrice();
                    }
                    if (viewModelMenuItemsRice != null) {
                        // read viewModel.menuItems["rice"].description
                        viewModelMenuItemsRiceDescription = viewModelMenuItemsRice.getDescription();
                        // read viewModel.menuItems["rice"].name
                        viewModelMenuItemsRiceName = viewModelMenuItemsRice.getName();
                        // read viewModel.menuItems["rice"].getFormattedPrice()
                        viewModelMenuItemsRiceGetFormattedPrice = viewModelMenuItemsRice.getFormattedPrice();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.cancelButton.setOnClickListener(mCallback11);
            this.nextButton.setOnClickListener(mCallback12);
            this.potatoes.setOnClickListener(mCallback9);
            this.rice.setOnClickListener(mCallback10);
            this.salad.setOnClickListener(mCallback7);
            this.soup.setOnClickListener(mCallback8);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.potatoDescription, viewModelMenuItemsPotatoesDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.potatoPrice, viewModelMenuItemsPotatoesGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.potatoes, viewModelMenuItemsPotatoesName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.rice, viewModelMenuItemsRiceName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.riceDescription, viewModelMenuItemsRiceDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.ricePrice, viewModelMenuItemsRiceGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.salad, viewModelMenuItemsSaladName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.saladDescription, viewModelMenuItemsSaladDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.saladPrice, viewModelMenuItemsSaladGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.soup, viewModelMenuItemsSoupName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.soupDescription, viewModelMenuItemsSoupDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.soupPrice, viewModelMenuItemsSoupGetFormattedPrice);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtotal, viewModelSubtotalGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 5: {
                // localize variables for thread safety
                // sideMenuFragment != null
                boolean sideMenuFragmentJavaLangObjectNull = false;
                // sideMenuFragment
                com.example.lunchtray.ui.order.SideMenuFragment sideMenuFragment = mSideMenuFragment;



                sideMenuFragmentJavaLangObjectNull = (sideMenuFragment) != (null);
                if (sideMenuFragmentJavaLangObjectNull) {


                    sideMenuFragment.cancelOrder();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // sideMenuFragment != null
                boolean sideMenuFragmentJavaLangObjectNull = false;
                // sideMenuFragment
                com.example.lunchtray.ui.order.SideMenuFragment sideMenuFragment = mSideMenuFragment;



                sideMenuFragmentJavaLangObjectNull = (sideMenuFragment) != (null);
                if (sideMenuFragmentJavaLangObjectNull) {


                    sideMenuFragment.goToNextScreen();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setSide("potatoes");
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setSide("soup");
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setSide("rice");
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setSide("salad");
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.subtotal
        flag 1 (0x2L): sideMenuFragment
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}