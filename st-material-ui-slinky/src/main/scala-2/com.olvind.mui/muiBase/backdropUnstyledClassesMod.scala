package com.olvind.mui.muiBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backdropUnstyledClassesMod {
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiBase.muiBaseStrings.root
    - `com.olvind.mui`.muiBase.muiBaseStrings.invisible
  */
  trait BackdropUnstyledClassKey extends StObject
  
  @js.native
  trait BackdropUnstyledClasses extends StObject {
    
    /** Styles applied to the root element if `invisible={true}`. */
    var invisible: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
  }
  object BackdropUnstyledClasses {
    
    @scala.inline
    def apply(invisible: String, root: String): BackdropUnstyledClasses = {
      val __obj = js.Dynamic.literal(invisible = invisible.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackdropUnstyledClasses]
    }
    
    @scala.inline
    implicit class BackdropUnstyledClassesMutableBuilder[Self <: BackdropUnstyledClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInvisible(value: String): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
