package com.example.imamkuham

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.StorageReference


//tremutno zakomentirano dok ne implementiramo do kraja sve ostalo, kod radi

class firebaseInitialization {
    var db = FirebaseFirestore.getInstance()

    // db.collection("recepti")
    //        .get()
    //        .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
    //            @Override
    //            public void onComplete(@NonNull Task<QuerySnapshot> task) {
    //                if (task.isSuccessful()) {
    //                    for (QueryDocumentSnapshot document : task.getResult()) {
    //                        Log.d(TAG, document.getId() + " => " + document.getData());
    //                    }
    //                } else {
    //                    Log.w(TAG, "Error getting documents.", task.getException());
    //                }
    //            }
    //        });
}

class storageInitialization {
    private val mStorageRef: StorageReference? = null
    // mStorageRef = FirebaseStorage.getInstance().getReference()

    //File localFile = File.createTempFile("slike", "jpg");
    //riversRef.getFile(localFile)
    //    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
    //        @Override
    //        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
    //            // Successfully downloaded data to local file
    //            // ...
    //        }
    //    }).addOnFailureListener(new OnFailureListener() {
    //        @Override
    //        public void onFailure(@NonNull Exception exception) {
    //            // Handle failed download
    //            // ...
    //        }
    //    });
}