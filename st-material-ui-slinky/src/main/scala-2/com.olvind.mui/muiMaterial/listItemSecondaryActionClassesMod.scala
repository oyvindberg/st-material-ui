package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemSecondaryActionClassesMod {
  
  @JSImport("@mui/material/ListItemSecondaryAction/listItemSecondaryActionClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/ListItemSecondaryAction/listItemSecondaryActionClasses", JSImport.Default)
  @js.native
  val default: ListItemSecondaryActionClasses = js.native
  
  @scala.inline
  def getListItemSecondaryActionClassesUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemSecondaryActionClassesUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disableGutters
  */
  trait ListItemSecondaryActionClassKey extends StObject
  
  @js.native
  trait ListItemSecondaryActionClasses extends StObject {
    
    /** Styles applied to the root element when the parent `ListItem` has `disableGutters={true}`. */
    var disableGutters: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
  }
  object ListItemSecondaryActionClasses {
    
    @scala.inline
    def apply(disableGutters: String, root: String): ListItemSecondaryActionClasses = {
      val __obj = js.Dynamic.literal(disableGutters = disableGutters.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemSecondaryActionClasses]
    }
    
    @scala.inline
    implicit class ListItemSecondaryActionClassesMutableBuilder[Self <: ListItemSecondaryActionClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableGutters(value: String): Self = StObject.set(x, "disableGutters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
