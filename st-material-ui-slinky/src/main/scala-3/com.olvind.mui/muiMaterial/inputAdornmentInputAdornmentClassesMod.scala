package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputAdornmentInputAdornmentClassesMod {
  
  @JSImport("@mui/material/InputAdornment/inputAdornmentClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/InputAdornment/inputAdornmentClasses", JSImport.Default)
  @js.native
  val default: InputAdornmentClasses = js.native
  
  inline def getInputAdornmentUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputAdornmentUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type InputAdornmentClassKey = "root" | "filled" | "outlined" | "standard" | "positionStart" | "positionEnd" | "disablePointerEvents" | "hiddenLabel" | "sizeSmall"
  
  trait InputAdornmentClasses extends StObject {
    
    /** Styles applied to the root element if `disablePointerEvents={true}`. */
    var disablePointerEvents: String
    
    /** Styles applied to the root element if `variant="filled"`. */
    var filled: String
    
    /** Styles applied if the adornment is used inside <FormControl hiddenLabel />. */
    var hiddenLabel: String
    
    /** Styles applied to the root element if `variant="outlined"`. */
    var outlined: String
    
    /** Styles applied to the root element if `position="end"`. */
    var positionEnd: String
    
    /** Styles applied to the root element if `position="start"`. */
    var positionStart: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied if the adornment is used inside <FormControl size="small" />. */
    var sizeSmall: String
    
    /** Styles applied to the root element if `variant="standard"`. */
    var standard: String
  }
  object InputAdornmentClasses {
    
    inline def apply(
      disablePointerEvents: String,
      filled: String,
      hiddenLabel: String,
      outlined: String,
      positionEnd: String,
      positionStart: String,
      root: String,
      sizeSmall: String,
      standard: String
    ): InputAdornmentClasses = {
      val __obj = js.Dynamic.literal(disablePointerEvents = disablePointerEvents.asInstanceOf[js.Any], filled = filled.asInstanceOf[js.Any], hiddenLabel = hiddenLabel.asInstanceOf[js.Any], outlined = outlined.asInstanceOf[js.Any], positionEnd = positionEnd.asInstanceOf[js.Any], positionStart = positionStart.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sizeSmall = sizeSmall.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputAdornmentClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputAdornmentClasses] (val x: Self) extends AnyVal {
      
      inline def setDisablePointerEvents(value: String): Self = StObject.set(x, "disablePointerEvents", value.asInstanceOf[js.Any])
      
      inline def setFilled(value: String): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
      
      inline def setHiddenLabel(value: String): Self = StObject.set(x, "hiddenLabel", value.asInstanceOf[js.Any])
      
      inline def setOutlined(value: String): Self = StObject.set(x, "outlined", value.asInstanceOf[js.Any])
      
      inline def setPositionEnd(value: String): Self = StObject.set(x, "positionEnd", value.asInstanceOf[js.Any])
      
      inline def setPositionStart(value: String): Self = StObject.set(x, "positionStart", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSizeSmall(value: String): Self = StObject.set(x, "sizeSmall", value.asInstanceOf[js.Any])
      
      inline def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    }
  }
}
