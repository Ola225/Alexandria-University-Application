package com.example.alexandriauniversityapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CoursesRVAdapter extends RecyclerView.Adapter<CoursesRVAdapter.ViewHolder> {

    // variable for our array list and context
    private ArrayList<CoursesModal> coursesModalArrayList;
    private Context context;

    // constructor
    public CoursesRVAdapter(ArrayList<CoursesModal> coursesModalArrayList, Context context) {
        this.coursesModalArrayList = coursesModalArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // on below line we are inflating our layout
        // file for our recycler view items.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.courses_rv_items, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // on below line we are setting data
        // to our views of recycler view item.
        CoursesModal modal = coursesModalArrayList.get(position);
        holder.cRegistrationNumberTv.setText(modal.getRegistrationNumber());
        holder.cCodeTv.setText(modal.getCode());
        holder.cNameTv.setText(modal.getCourse_name());
        holder.cCreditHoursTv.setText(modal.getCredit_hours());
        holder.cNumTakingTv.setText(modal.getNum_taking_course());
        holder.cSemesterTv.setText(modal.getSemester());
        holder.cYearTv.setText(modal.getYear());
        holder.cLecturerFirstNameTv.setText(modal.getLecturer_firstName());
        holder.cLecturerMiddleNameTv.setText(modal.getLecturer_middleName());
        holder.cLecturerLastNameTv.setText(modal.getLecturer_lastName());
        holder.cGtaFirstNameTv.setText(modal.getGTA_firstName());
        holder.cGtaMiddleNameTv.setText(modal.getGTA_middleName());
        holder.cGtaLastNameTv.setText(modal.getGTA_lastName());
        holder.cExamOutOf30Tv.setText(modal.getExam_out_of_30());
        holder.cExamOutOf20Tv.setText(modal.getExam_out_of_20());
        holder.cWorkTv.setText(modal.getWork());
        holder.cFinalExamTv.setText(modal.getFinal_exam());
        holder.cSumTv.setText(modal.getSum());
        holder.cGradeTv.setText(modal.getGrade());
        holder.cAbsenceTv.setText(modal.getAbsence());

    }

    @Override
    public int getItemCount() {
        // returning the size of our array list
        return coursesModalArrayList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView cRegistrationNumberTv,cCodeTv,cNameTv,cCreditHoursTv,cNumTakingTv,cSemesterTv, cYearTv,
                cLecturerFirstNameTv,cLecturerMiddleNameTv,cLecturerLastNameTv,cGtaFirstNameTv,cGtaMiddleNameTv,cGtaLastNameTv,
                cExamOutOf30Tv,cExamOutOf20Tv,cWorkTv,cFinalExamTv,cSumTv,cGradeTv,cAbsenceTv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // initializing our text views
            cRegistrationNumberTv = itemView.findViewById(R.id.cRegNumTv);
            cCodeTv = itemView.findViewById(R.id.cCodeTv);
            cNameTv = itemView.findViewById(R.id.cNameTv);
            cCreditHoursTv = itemView.findViewById(R.id.cCreditHoursTv);
            cNumTakingTv = itemView.findViewById(R.id.cNumTakingCourseTv);
            cSemesterTv = itemView.findViewById(R.id.cSemesterTv);
            cYearTv = itemView.findViewById(R.id.cYearTv);
            cLecturerFirstNameTv = itemView.findViewById(R.id.cLecturerFirNameTv);
            cLecturerMiddleNameTv = itemView.findViewById(R.id.cLecturerMiddleNameTv);
            cLecturerLastNameTv = itemView.findViewById(R.id.cLecturerLastNameTv);
            cGtaFirstNameTv = itemView.findViewById(R.id.cGtaFirstNameTv);
            cGtaMiddleNameTv = itemView.findViewById(R.id.cGtaMiddleNameTv);
            cGtaLastNameTv = itemView.findViewById(R.id.cGtaLastNameTv);
            cExamOutOf30Tv = itemView.findViewById(R.id.cExamOutOf30Tv);
            cExamOutOf20Tv = itemView.findViewById(R.id.cExamOutOf20Tv);
            cWorkTv = itemView.findViewById(R.id.cWorkTv);
            cFinalExamTv = itemView.findViewById(R.id.cFinalExamTv);
            cSumTv = itemView.findViewById(R.id.cSumTv);
            cGradeTv = itemView.findViewById(R.id.cGradeTv);
            cAbsenceTv = itemView.findViewById(R.id.cAbsenceTv);


        }
    }


}
