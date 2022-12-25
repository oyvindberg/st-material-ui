package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemContentListItemContentClassesMod {
  
  @JSImport("@mui/joy/ListItemContent/listItemContentClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/ListItemContent/listItemContentClasses", JSImport.Default)
  @js.native
  val default: ListItemContentClasses = js.native
  
  inline def getListItemContentUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemContentUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ListItemContentClassKey = "root"
  
  trait ListItemContentClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String
  }
  object ListItemContentClasses {
    
    inline def apply(root: String): ListItemContentClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemContentClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemContentClasses] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
