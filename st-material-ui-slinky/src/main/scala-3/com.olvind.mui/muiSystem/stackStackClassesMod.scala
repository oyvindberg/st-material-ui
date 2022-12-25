package com.olvind.mui.muiSystem

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackStackClassesMod {
  
  trait StackClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String
  }
  object StackClasses {
    
    inline def apply(root: String): StackClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StackClasses] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
