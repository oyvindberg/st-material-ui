package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogContentClassesMod {
  
  @JSImport("@mui/material/DialogContent/dialogContentClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/DialogContent/dialogContentClasses", JSImport.Default)
  @js.native
  val default: DialogContentClasses = js.native
  
  @scala.inline
  def getDialogContentUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDialogContentUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.dividers
  */
  trait DialogContentClassKey extends StObject
  
  @js.native
  trait DialogContentClasses extends StObject {
    
    /** Styles applied to the root element if `dividers={true}`. */
    var dividers: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
  }
  object DialogContentClasses {
    
    @scala.inline
    def apply(dividers: String, root: String): DialogContentClasses = {
      val __obj = js.Dynamic.literal(dividers = dividers.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogContentClasses]
    }
    
    @scala.inline
    implicit class DialogContentClassesMutableBuilder[Self <: DialogContentClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDividers(value: String): Self = StObject.set(x, "dividers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
