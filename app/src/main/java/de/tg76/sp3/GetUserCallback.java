package de.tg76.sp3;

/**
 * This class is used to inform any activity when background process is finished */

//Inform the activity when the server request is finished
interface GetUserCallback {

    void done(User returnedUser);
}
