package com.emilyphan.awsimageupload.bucket;

public enum BucketName {
    //create s3 bucket
    // there are different ways to create bucket : by code or by cloud formation, terraform
    //this bucket is a pieces of infrastructure so it is recommend to create it through Amazon console and use enum here to access it
    PROFILE_IMAGE("emily-image-upload");
    private  final String bucketName;
    BucketName(String bucketName){
        this.bucketName= bucketName;
    }
    public String getBucketName(){
        return bucketName;
    }
}
