package com.olvind.mui.muiBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalUnstyledClassesMod {
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiBase.muiBaseStrings.root
    - `com.olvind.mui`.muiBase.muiBaseStrings.hidden
  */
  trait ModalUnstyledClassKey extends StObject
  
  @js.native
  trait ModalUnstyledClasses extends StObject {
    
    /** Styles applied to the root element if the `Modal` has exited. */
    var hidden: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
  }
  object ModalUnstyledClasses {
    
    @scala.inline
    def apply(hidden: String, root: String): ModalUnstyledClasses = {
      val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalUnstyledClasses]
    }
    
    @scala.inline
    implicit class ModalUnstyledClassesMutableBuilder[Self <: ModalUnstyledClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
