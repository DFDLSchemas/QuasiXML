package com.tresys.blogs

import org.junit.Test
// import org.apache.daffodil.tdml.Runner
import org.apache.daffodil.tdml.Runner
import org.junit.AfterClass

object TestBlogs {
  val runner = Runner("com/tresys/blogs", "blogs.tdml")

  @AfterClass def shutDown = {
    runner.reset()
  }
}

class TestBlogs {

  import TestBlogs._

  @Test def test_blog01() = { runner.runOneTest("blog01") }

}
