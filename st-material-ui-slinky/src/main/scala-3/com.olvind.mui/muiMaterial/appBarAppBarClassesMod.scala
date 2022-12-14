package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appBarAppBarClassesMod {
  
  @JSImport("@mui/material/AppBar/appBarClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/AppBar/appBarClasses", JSImport.Default)
  @js.native
  val default: AppBarClasses = js.native
  
  inline def getAppBarUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppBarUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type AppBarClassKey = "root" | "positionFixed" | "positionAbsolute" | "positionSticky" | "positionStatic" | "positionRelative" | "colorDefault" | "colorPrimary" | "colorSecondary" | "colorInherit" | "colorTransparent"
  
  trait AppBarClasses extends StObject {
    
    /** Styles applied to the root element if `color="default"`. */
    var colorDefault: String
    
    /** Styles applied to the root element if `color="inherit"`. */
    var colorInherit: String
    
    /** Styles applied to the root element if `color="primary"`. */
    var colorPrimary: String
    
    /** Styles applied to the root element if `color="secondary"`. */
    var colorSecondary: String
    
    /** Styles applied to the root element if `color="transparent"`. */
    var colorTransparent: String
    
    /** Styles applied to the root element if `position="absolute"`. */
    var positionAbsolute: String
    
    /** Styles applied to the root element if `position="fixed"`. */
    var positionFixed: String
    
    /** Styles applied to the root element if `position="relative"`. */
    var positionRelative: String
    
    /** Styles applied to the root element if `position="static"`. */
    var positionStatic: String
    
    /** Styles applied to the root element if `position="sticky"`. */
    var positionSticky: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object AppBarClasses {
    
    inline def apply(
      colorDefault: String,
      colorInherit: String,
      colorPrimary: String,
      colorSecondary: String,
      colorTransparent: String,
      positionAbsolute: String,
      positionFixed: String,
      positionRelative: String,
      positionStatic: String,
      positionSticky: String,
      root: String
    ): AppBarClasses = {
      val __obj = js.Dynamic.literal(colorDefault = colorDefault.asInstanceOf[js.Any], colorInherit = colorInherit.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSecondary = colorSecondary.asInstanceOf[js.Any], colorTransparent = colorTransparent.asInstanceOf[js.Any], positionAbsolute = positionAbsolute.asInstanceOf[js.Any], positionFixed = positionFixed.asInstanceOf[js.Any], positionRelative = positionRelative.asInstanceOf[js.Any], positionStatic = positionStatic.asInstanceOf[js.Any], positionSticky = positionSticky.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppBarClasses]
    }
    
    extension [Self <: AppBarClasses](x: Self) {
      
      inline def setColorDefault(value: String): Self = StObject.set(x, "colorDefault", value.asInstanceOf[js.Any])
      
      inline def setColorInherit(value: String): Self = StObject.set(x, "colorInherit", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
      
      inline def setColorTransparent(value: String): Self = StObject.set(x, "colorTransparent", value.asInstanceOf[js.Any])
      
      inline def setPositionAbsolute(value: String): Self = StObject.set(x, "positionAbsolute", value.asInstanceOf[js.Any])
      
      inline def setPositionFixed(value: String): Self = StObject.set(x, "positionFixed", value.asInstanceOf[js.Any])
      
      inline def setPositionRelative(value: String): Self = StObject.set(x, "positionRelative", value.asInstanceOf[js.Any])
      
      inline def setPositionStatic(value: String): Self = StObject.set(x, "positionStatic", value.asInstanceOf[js.Any])
      
      inline def setPositionSticky(value: String): Self = StObject.set(x, "positionSticky", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
