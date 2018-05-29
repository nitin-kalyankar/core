package com.mxbi.core

import org.scalatest.FunSuite

class DemoTest extends FunSuite {
  test("test"){
    val str=new Demo().test("nitin")
    assert(str=="nitin")

  }
}
