package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alertClassesMod {
  
  @JSImport("@mui/material/Alert/alertClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Alert/alertClasses", JSImport.Default)
  @js.native
  val default: AlertClasses = js.native
  
  @scala.inline
  def getAlertUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlertUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.filled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.outlined
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.standard
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.standardSuccess
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.standardInfo
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.standardWarning
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.standardError
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.outlinedSuccess
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.outlinedInfo
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.outlinedWarning
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.outlinedError
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.filledSuccess
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.filledInfo
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.filledWarning
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.filledError
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.icon
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.message
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.action
  */
  trait AlertClassKey extends StObject
  
  @js.native
  trait AlertClasses extends StObject {
    
    /** Styles applied to the action wrapper element if `action` is provided. */
    var action: String = js.native
    
    /** Styles applied to the root element if `variant="filled"`. */
    var filled: String = js.native
    
    /** Styles applied to the root element if `variant="filled"` and `color="error"`. */
    var filledError: String = js.native
    
    /** Styles applied to the root element if `variant="filled"` and `color="info"`. */
    var filledInfo: String = js.native
    
    /** Styles applied to the root element if `variant="filled"` and `color="success"`. */
    var filledSuccess: String = js.native
    
    /** Styles applied to the root element if `variant="filled"` and `color="warning"`. */
    var filledWarning: String = js.native
    
    /** Styles applied to the icon wrapper element. */
    var icon: String = js.native
    
    /** Styles applied to the message wrapper element. */
    var message: String = js.native
    
    /** Styles applied to the root element if `variant="outlined"`. */
    var outlined: String = js.native
    
    /** Styles applied to the root element if `variant="outlined"` and `color="error"`. */
    var outlinedError: String = js.native
    
    /** Styles applied to the root element if `variant="outlined"` and `color="info"`. */
    var outlinedInfo: String = js.native
    
    /** Styles applied to the root element if `variant="outlined"` and `color="success"`. */
    var outlinedSuccess: String = js.native
    
    /** Styles applied to the root element if `variant="outlined"` and `color="warning"`. */
    var outlinedWarning: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the root element if `variant="standard"`. */
    var standard: String = js.native
    
    /** Styles applied to the root element if `variant="standard"` and `color="error"`. */
    var standardError: String = js.native
    
    /** Styles applied to the root element if `variant="standard"` and `color="info"`. */
    var standardInfo: String = js.native
    
    /** Styles applied to the root element if `variant="standard"` and `color="success"`. */
    var standardSuccess: String = js.native
    
    /** Styles applied to the root element if `variant="standard"` and `color="warning"`. */
    var standardWarning: String = js.native
  }
  object AlertClasses {
    
    @scala.inline
    def apply(
      action: String,
      filled: String,
      filledError: String,
      filledInfo: String,
      filledSuccess: String,
      filledWarning: String,
      icon: String,
      message: String,
      outlined: String,
      outlinedError: String,
      outlinedInfo: String,
      outlinedSuccess: String,
      outlinedWarning: String,
      root: String,
      standard: String,
      standardError: String,
      standardInfo: String,
      standardSuccess: String,
      standardWarning: String
    ): AlertClasses = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], filled = filled.asInstanceOf[js.Any], filledError = filledError.asInstanceOf[js.Any], filledInfo = filledInfo.asInstanceOf[js.Any], filledSuccess = filledSuccess.asInstanceOf[js.Any], filledWarning = filledWarning.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], outlined = outlined.asInstanceOf[js.Any], outlinedError = outlinedError.asInstanceOf[js.Any], outlinedInfo = outlinedInfo.asInstanceOf[js.Any], outlinedSuccess = outlinedSuccess.asInstanceOf[js.Any], outlinedWarning = outlinedWarning.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any], standardError = standardError.asInstanceOf[js.Any], standardInfo = standardInfo.asInstanceOf[js.Any], standardSuccess = standardSuccess.asInstanceOf[js.Any], standardWarning = standardWarning.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlertClasses]
    }
    
    @scala.inline
    implicit class AlertClassesMutableBuilder[Self <: AlertClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilled(value: String): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilledError(value: String): Self = StObject.set(x, "filledError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilledInfo(value: String): Self = StObject.set(x, "filledInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilledSuccess(value: String): Self = StObject.set(x, "filledSuccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilledWarning(value: String): Self = StObject.set(x, "filledWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlined(value: String): Self = StObject.set(x, "outlined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlinedError(value: String): Self = StObject.set(x, "outlinedError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlinedInfo(value: String): Self = StObject.set(x, "outlinedInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlinedSuccess(value: String): Self = StObject.set(x, "outlinedSuccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlinedWarning(value: String): Self = StObject.set(x, "outlinedWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandardError(value: String): Self = StObject.set(x, "standardError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandardInfo(value: String): Self = StObject.set(x, "standardInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandardSuccess(value: String): Self = StObject.set(x, "standardSuccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandardWarning(value: String): Self = StObject.set(x, "standardWarning", value.asInstanceOf[js.Any])
    }
  }
}
