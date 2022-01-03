package com.olvind.mui.muiBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabPanelUnstyledClassesMod {
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiBase.muiBaseStrings.root
    - `com.olvind.mui`.muiBase.muiBaseStrings.hidden
  */
  trait TabPanelUnstyledClassKey extends StObject
  
  @js.native
  trait TabPanelUnstyledClasses extends StObject {
    
    var hidden: String = js.native
    
    var root: String = js.native
  }
  object TabPanelUnstyledClasses {
    
    @scala.inline
    def apply(hidden: String, root: String): TabPanelUnstyledClasses = {
      val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabPanelUnstyledClasses]
    }
    
    @scala.inline
    implicit class TabPanelUnstyledClassesMutableBuilder[Self <: TabPanelUnstyledClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
