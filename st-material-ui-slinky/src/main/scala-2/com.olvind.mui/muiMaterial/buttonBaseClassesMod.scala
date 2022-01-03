package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonBaseClassesMod {
  
  @JSImport("@mui/material/ButtonBase/buttonBaseClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/ButtonBase/buttonBaseClasses", JSImport.Default)
  @js.native
  val default: ButtonBaseClasses = js.native
  
  @scala.inline
  def getButtonBaseUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getButtonBaseUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disabled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.focusVisible
  */
  trait ButtonBaseClassKey extends StObject
  
  @js.native
  trait ButtonBaseClasses extends StObject {
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String = js.native
    
    /** State class applied to the root element if keyboard focused. */
    var focusVisible: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
  }
  object ButtonBaseClasses {
    
    @scala.inline
    def apply(disabled: String, focusVisible: String, root: String): ButtonBaseClasses = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonBaseClasses]
    }
    
    @scala.inline
    implicit class ButtonBaseClassesMutableBuilder[Self <: ButtonBaseClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
