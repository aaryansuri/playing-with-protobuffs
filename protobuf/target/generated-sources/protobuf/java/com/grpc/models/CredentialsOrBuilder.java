// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: credentials.proto

package com.grpc.models;

public interface CredentialsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Credentials)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.EmailCredentials emailMode = 1;</code>
   * @return Whether the emailMode field is set.
   */
  boolean hasEmailMode();
  /**
   * <code>.EmailCredentials emailMode = 1;</code>
   * @return The emailMode.
   */
  com.grpc.models.EmailCredentials getEmailMode();
  /**
   * <code>.EmailCredentials emailMode = 1;</code>
   */
  com.grpc.models.EmailCredentialsOrBuilder getEmailModeOrBuilder();

  /**
   * <code>.PhoneOTP phoneMode = 2;</code>
   * @return Whether the phoneMode field is set.
   */
  boolean hasPhoneMode();
  /**
   * <code>.PhoneOTP phoneMode = 2;</code>
   * @return The phoneMode.
   */
  com.grpc.models.PhoneOTP getPhoneMode();
  /**
   * <code>.PhoneOTP phoneMode = 2;</code>
   */
  com.grpc.models.PhoneOTPOrBuilder getPhoneModeOrBuilder();

  public com.grpc.models.Credentials.ModeCase getModeCase();
}
