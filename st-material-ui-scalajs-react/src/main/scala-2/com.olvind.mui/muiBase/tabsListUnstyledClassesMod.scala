package com.olvind.mui.muiBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsListUnstyledClassesMod {
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiBase.muiBaseStrings.root
    - `com.olvind.mui`.muiBase.muiBaseStrings.horizontal
    - `com.olvind.mui`.muiBase.muiBaseStrings.vertical
  */
  trait TabsListUnstyledClassKey extends StObject
  
  @js.native
  trait TabsListUnstyledClasses extends StObject {
    
    var horizontal: String = js.native
    
    var root: String = js.native
    
    var vertical: String = js.native
  }
  object TabsListUnstyledClasses {
    
    @scala.inline
    def apply(horizontal: String, root: String, vertical: String): TabsListUnstyledClasses = {
      val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsListUnstyledClasses]
    }
    
    @scala.inline
    implicit class TabsListUnstyledClassesMutableBuilder[Self <: TabsListUnstyledClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
}
