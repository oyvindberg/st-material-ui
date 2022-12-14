package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snackbarSnackbarClassesMod {
  
  @JSImport("@mui/material/Snackbar/snackbarClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Snackbar/snackbarClasses", JSImport.Default)
  @js.native
  val default: SnackbarClasses = js.native
  
  inline def getSnackbarUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSnackbarUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type SnackbarClassKey = "root" | "anchorOriginTopCenter" | "anchorOriginBottomCenter" | "anchorOriginTopRight" | "anchorOriginBottomRight" | "anchorOriginTopLeft" | "anchorOriginBottomLeft"
  
  trait SnackbarClasses extends StObject {
    
    /** Styles applied to the root element if `anchorOrigin={{ 'bottom', 'center' }}`. */
    var anchorOriginBottomCenter: String
    
    /** Styles applied to the root element if `anchorOrigin={{ 'bottom', 'left' }}`. */
    var anchorOriginBottomLeft: String
    
    /** Styles applied to the root element if `anchorOrigin={{ 'bottom', 'right' }}`. */
    var anchorOriginBottomRight: String
    
    /** Styles applied to the root element if `anchorOrigin={{ 'top', 'center' }}`. */
    var anchorOriginTopCenter: String
    
    /** Styles applied to the root element if `anchorOrigin={{ 'top', 'left' }}`. */
    var anchorOriginTopLeft: String
    
    /** Styles applied to the root element if `anchorOrigin={{ 'top', 'right' }}`. */
    var anchorOriginTopRight: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object SnackbarClasses {
    
    inline def apply(
      anchorOriginBottomCenter: String,
      anchorOriginBottomLeft: String,
      anchorOriginBottomRight: String,
      anchorOriginTopCenter: String,
      anchorOriginTopLeft: String,
      anchorOriginTopRight: String,
      root: String
    ): SnackbarClasses = {
      val __obj = js.Dynamic.literal(anchorOriginBottomCenter = anchorOriginBottomCenter.asInstanceOf[js.Any], anchorOriginBottomLeft = anchorOriginBottomLeft.asInstanceOf[js.Any], anchorOriginBottomRight = anchorOriginBottomRight.asInstanceOf[js.Any], anchorOriginTopCenter = anchorOriginTopCenter.asInstanceOf[js.Any], anchorOriginTopLeft = anchorOriginTopLeft.asInstanceOf[js.Any], anchorOriginTopRight = anchorOriginTopRight.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnackbarClasses]
    }
    
    extension [Self <: SnackbarClasses](x: Self) {
      
      inline def setAnchorOriginBottomCenter(value: String): Self = StObject.set(x, "anchorOriginBottomCenter", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginBottomLeft(value: String): Self = StObject.set(x, "anchorOriginBottomLeft", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginBottomRight(value: String): Self = StObject.set(x, "anchorOriginBottomRight", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginTopCenter(value: String): Self = StObject.set(x, "anchorOriginTopCenter", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginTopLeft(value: String): Self = StObject.set(x, "anchorOriginTopLeft", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginTopRight(value: String): Self = StObject.set(x, "anchorOriginTopRight", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
