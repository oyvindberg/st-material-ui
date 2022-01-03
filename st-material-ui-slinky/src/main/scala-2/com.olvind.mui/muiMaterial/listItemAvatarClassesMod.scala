package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemAvatarClassesMod {
  
  @JSImport("@mui/material/ListItemAvatar/listItemAvatarClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/ListItemAvatar/listItemAvatarClasses", JSImport.Default)
  @js.native
  val default: ListItemAvatarClasses = js.native
  
  @scala.inline
  def getListItemAvatarUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemAvatarUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.alignItemsFlexStart
  */
  trait ListItemAvatarClassKey extends StObject
  
  @js.native
  trait ListItemAvatarClasses extends StObject {
    
    /** Styles applied to the root element when the parent `ListItem` uses `alignItems="flex-start"`. */
    var alignItemsFlexStart: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
  }
  object ListItemAvatarClasses {
    
    @scala.inline
    def apply(alignItemsFlexStart: String, root: String): ListItemAvatarClasses = {
      val __obj = js.Dynamic.literal(alignItemsFlexStart = alignItemsFlexStart.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemAvatarClasses]
    }
    
    @scala.inline
    implicit class ListItemAvatarClassesMutableBuilder[Self <: ListItemAvatarClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignItemsFlexStart(value: String): Self = StObject.set(x, "alignItemsFlexStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
