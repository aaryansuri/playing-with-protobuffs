// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dealer.proto

package com.grpc.models;

public interface DealerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Dealer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;int32, .common.Car&gt; model = 1;</code>
   */
  int getModelCount();
  /**
   * <code>map&lt;int32, .common.Car&gt; model = 1;</code>
   */
  boolean containsModel(
      int key);
  /**
   * Use {@link #getModelMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, com.grpc.models.Car>
  getModel();
  /**
   * <code>map&lt;int32, .common.Car&gt; model = 1;</code>
   */
  java.util.Map<java.lang.Integer, com.grpc.models.Car>
  getModelMap();
  /**
   * <code>map&lt;int32, .common.Car&gt; model = 1;</code>
   */

  /* nullable */
com.grpc.models.Car getModelOrDefault(
      int key,
      /* nullable */
com.grpc.models.Car defaultValue);
  /**
   * <code>map&lt;int32, .common.Car&gt; model = 1;</code>
   */

  com.grpc.models.Car getModelOrThrow(
      int key);
}
