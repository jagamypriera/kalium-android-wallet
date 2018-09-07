package com.banano.kaliumwallet.ui.contact;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.banano.kaliumwallet.R;
import com.banano.kaliumwallet.databinding.ViewHolderContactSmBinding;
import com.banano.kaliumwallet.model.Contact;

import java.util.List;

public class ContactSelectionAdapter  extends RecyclerView.Adapter<ContactSelectionAdapter.ViewHolder> {
    private List<Contact> contactList;

    public ContactSelectionAdapter(List<Contact> flsLst) {
        contactList = flsLst;
    }

    @Override
    public ContactSelectionAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                                    int viewType) {
        ViewHolderContactSmBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.view_holder_contact_sm, parent, false);

        ViewHolder viewHolder = new ViewHolder(binding);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Contact contact = contactList.get(position);
        holder.contactItemBinding.setContact(contact);
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolderContactSmBinding contactItemBinding;

        public ViewHolder(ViewHolderContactSmBinding contactSmItemLayoutBinding) {
            super(contactSmItemLayoutBinding.getRoot());
            contactItemBinding = contactSmItemLayoutBinding;
        }
    }
}