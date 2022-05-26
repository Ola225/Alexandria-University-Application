package com.example.alexandriauniversityapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentRVAdapter extends RecyclerView.Adapter<StudentRVAdapter.ViewHolder> {

    private ArrayList<StudentModal> studentModalArrayList;
    private Context context;

    public  StudentRVAdapter(ArrayList<StudentModal> studentModalArrayList , Context context){
        this.studentModalArrayList =studentModalArrayList;
        this.context=context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // on below line we are inflating our layout
        // file for our recycler view items.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_rv_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // on below line we are setting data
        // to our views of recycler view item.
        StudentModal modal = studentModalArrayList.get(position);
        holder.firstNameTv.setText(modal.getFirstName());
        holder.middleNameTv.setText(modal.getMiddleName());
        holder.lastNameTv.setText(modal.getLastName());
        holder.nationalityTv.setText(modal.getNationality());
        holder.studentIdTv.setText(modal.getStudentId());
        holder.homeAddressTv.setText(modal.getHomeAddress());
        holder.ageTv.setText(modal.getAge());
        holder.genderTv.setText(modal.getGender());
        holder.collegeTv.setText(modal.getCollege());
        holder.termTv.setText(modal.getTerm());
        holder.yearTv.setText(modal.getYear());
        holder.departmentTv.setText(modal.getDepartment());
        holder.emailTv.setText(modal.getEmail());
        holder.mobileNumberTv.setText(modal.getPhoneNumber());
        holder.registrationNumberTv.setText(modal.getRegistrationNumber());
    }
    @Override
    public int getItemCount() {
        // returning the size of our array list
        return studentModalArrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView firstNameTv,middleNameTv,lastNameTv,nationalityTv,studentIdTv,homeAddressTv,
                ageTv,genderTv,collegeTv,termTv,yearTv,departmentTv,emailTv,mobileNumberTv,registrationNumberTv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // initializing our text views
            firstNameTv = itemView.findViewById(R.id.firstNameTv);
            middleNameTv = itemView.findViewById(R.id.middleNameTv);
            lastNameTv = itemView.findViewById(R.id.lastNameTv);
            nationalityTv = itemView.findViewById(R.id.nationalityTv);
            studentIdTv = itemView.findViewById(R.id.studentIdTv);
            homeAddressTv = itemView.findViewById(R.id.homeAddressTv);
            ageTv = itemView.findViewById(R.id.ageTv);
            genderTv = itemView.findViewById(R.id.genderTv);
            collegeTv = itemView.findViewById(R.id.collegeTv);
            termTv = itemView.findViewById(R.id.termTv);
            yearTv = itemView.findViewById(R.id.yearTv);
            departmentTv = itemView.findViewById(R.id.departmentTv);
            emailTv = itemView.findViewById(R.id.emailTv);
            mobileNumberTv = itemView.findViewById(R.id.mobilePhoneTv);
            registrationNumberTv = itemView.findViewById(R.id.registrationNumberTv);


        }
    }
}



