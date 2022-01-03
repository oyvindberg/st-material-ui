package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listSubheaderClassesMod {
  
  @JSImport("@mui/material/ListSubheader/listSubheaderClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/ListSubheader/listSubheaderClasses", JSImport.Default)
  @js.native
  val default: ListSubheaderClasses = js.native
  
  inline def getListSubheaderUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListSubheaderUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorPrimary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorInherit
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.gutters
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.inset
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.sticky
  */
  trait ListSubheaderClassKey extends StObject
  
  trait ListSubheaderClasses extends StObject {
    
    /** Styles applied to the root element if `color="inherit"`. */
    var colorInherit: String
    
    /** Styles applied to the root element if `color="primary"`. */
    var colorPrimary: String
    
    /** Styles applied to the inner `component` element unless `disableGutters={true}`. */
    var gutters: String
    
    /** Styles applied to the root element if `inset={true}`. */
    var inset: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element unless `disableSticky={true}`. */
    var sticky: String
  }
  object ListSubheaderClasses {
    
    inline def apply(
      colorInherit: String,
      colorPrimary: String,
      gutters: String,
      inset: String,
      root: String,
      sticky: String
    ): ListSubheaderClasses = {
      val __obj = js.Dynamic.literal(colorInherit = colorInherit.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], gutters = gutters.asInstanceOf[js.Any], inset = inset.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sticky = sticky.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListSubheaderClasses]
    }
    
    extension [Self <: ListSubheaderClasses](x: Self) {
      
      inline def setColorInherit(value: String): Self = StObject.set(x, "colorInherit", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setGutters(value: String): Self = StObject.set(x, "gutters", value.asInstanceOf[js.Any])
      
      inline def setInset(value: String): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSticky(value: String): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    }
  }
}
