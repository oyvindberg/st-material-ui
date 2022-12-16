package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconButtonIconButtonClassesMod {
  
  @JSImport("@mui/material/IconButton/iconButtonClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/IconButton/iconButtonClasses", JSImport.Default)
  @js.native
  val default: IconButtonClasses = js.native
  
  inline def getIconButtonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconButtonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type IconButtonClassKey = "root" | "edgeStart" | "edgeEnd" | "colorInherit" | "colorPrimary" | "colorSecondary" | "colorError" | "colorInfo" | "colorSuccess" | "colorWarning" | "disabled" | "sizeSmall" | "sizeMedium" | "sizeLarge"
  
  trait IconButtonClasses extends StObject {
    
    /** Styles applied to the root element if `color="error"`. */
    var colorError: String
    
    /** Styles applied to the root element if `color="info"`. */
    var colorInfo: String
    
    /** Styles applied to the root element if `color="inherit"`. */
    var colorInherit: String
    
    /** Styles applied to the root element if `color="primary"`. */
    var colorPrimary: String
    
    /** Styles applied to the root element if `color="secondary"`. */
    var colorSecondary: String
    
    /** Styles applied to the root element if `color="success"`. */
    var colorSuccess: String
    
    /** Styles applied to the root element if `color="warning"`. */
    var colorWarning: String
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String
    
    /** Styles applied to the root element if `edge="end"`. */
    var edgeEnd: String
    
    /** Styles applied to the root element if `edge="start"`. */
    var edgeStart: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `size="large"`. */
    var sizeLarge: String
    
    /** Styles applied to the root element if `size="medium"`. */
    var sizeMedium: String
    
    /** Styles applied to the root element if `size="small"`. */
    var sizeSmall: String
  }
  object IconButtonClasses {
    
    inline def apply(
      colorError: String,
      colorInfo: String,
      colorInherit: String,
      colorPrimary: String,
      colorSecondary: String,
      colorSuccess: String,
      colorWarning: String,
      disabled: String,
      edgeEnd: String,
      edgeStart: String,
      root: String,
      sizeLarge: String,
      sizeMedium: String,
      sizeSmall: String
    ): IconButtonClasses = {
      val __obj = js.Dynamic.literal(colorError = colorError.asInstanceOf[js.Any], colorInfo = colorInfo.asInstanceOf[js.Any], colorInherit = colorInherit.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSecondary = colorSecondary.asInstanceOf[js.Any], colorSuccess = colorSuccess.asInstanceOf[js.Any], colorWarning = colorWarning.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], edgeEnd = edgeEnd.asInstanceOf[js.Any], edgeStart = edgeStart.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sizeLarge = sizeLarge.asInstanceOf[js.Any], sizeMedium = sizeMedium.asInstanceOf[js.Any], sizeSmall = sizeSmall.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconButtonClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconButtonClasses] (val x: Self) extends AnyVal {
      
      inline def setColorError(value: String): Self = StObject.set(x, "colorError", value.asInstanceOf[js.Any])
      
      inline def setColorInfo(value: String): Self = StObject.set(x, "colorInfo", value.asInstanceOf[js.Any])
      
      inline def setColorInherit(value: String): Self = StObject.set(x, "colorInherit", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
      
      inline def setColorSuccess(value: String): Self = StObject.set(x, "colorSuccess", value.asInstanceOf[js.Any])
      
      inline def setColorWarning(value: String): Self = StObject.set(x, "colorWarning", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setEdgeEnd(value: String): Self = StObject.set(x, "edgeEnd", value.asInstanceOf[js.Any])
      
      inline def setEdgeStart(value: String): Self = StObject.set(x, "edgeStart", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSizeLarge(value: String): Self = StObject.set(x, "sizeLarge", value.asInstanceOf[js.Any])
      
      inline def setSizeMedium(value: String): Self = StObject.set(x, "sizeMedium", value.asInstanceOf[js.Any])
      
      inline def setSizeSmall(value: String): Self = StObject.set(x, "sizeSmall", value.asInstanceOf[js.Any])
    }
  }
}
