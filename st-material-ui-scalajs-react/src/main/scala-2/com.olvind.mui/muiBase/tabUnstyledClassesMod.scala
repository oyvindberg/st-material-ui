package com.olvind.mui.muiBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabUnstyledClassesMod {
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiBase.muiBaseStrings.root
    - `com.olvind.mui`.muiBase.muiBaseStrings.selected
    - `com.olvind.mui`.muiBase.muiBaseStrings.disabled
  */
  trait TabUnstyledClassKey extends StObject
  
  @js.native
  trait TabUnstyledClasses extends StObject {
    
    var disabled: String = js.native
    
    var root: String = js.native
    
    var selected: String = js.native
  }
  object TabUnstyledClasses {
    
    @scala.inline
    def apply(disabled: String, root: String, selected: String): TabUnstyledClasses = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabUnstyledClasses]
    }
    
    @scala.inline
    implicit class TabUnstyledClassesMutableBuilder[Self <: TabUnstyledClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
