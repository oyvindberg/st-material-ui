package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemAvatarListItemAvatarClassesMod {
  
  @JSImport("@mui/material/ListItemAvatar/listItemAvatarClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/ListItemAvatar/listItemAvatarClasses", JSImport.Default)
  @js.native
  val default: ListItemAvatarClasses = js.native
  
  inline def getListItemAvatarUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemAvatarUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ListItemAvatarClassKey = "root" | "alignItemsFlexStart"
  
  trait ListItemAvatarClasses extends StObject {
    
    /** Styles applied to the root element when the parent `ListItem` uses `alignItems="flex-start"`. */
    var alignItemsFlexStart: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object ListItemAvatarClasses {
    
    inline def apply(alignItemsFlexStart: String, root: String): ListItemAvatarClasses = {
      val __obj = js.Dynamic.literal(alignItemsFlexStart = alignItemsFlexStart.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemAvatarClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemAvatarClasses] (val x: Self) extends AnyVal {
      
      inline def setAlignItemsFlexStart(value: String): Self = StObject.set(x, "alignItemsFlexStart", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
