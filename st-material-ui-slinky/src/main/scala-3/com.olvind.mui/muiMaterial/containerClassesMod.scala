package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerClassesMod {
  
  @JSImport("@mui/material/Container/containerClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Container/containerClasses", JSImport.Default)
  @js.native
  val default: ContainerClasses = js.native
  
  inline def getContainerUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getContainerUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disableGutters
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.fixed
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.maxWidthXs
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.maxWidthSm
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.maxWidthMd
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.maxWidthLg
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.maxWidthXl
  */
  trait ContainerClassKey extends StObject
  
  trait ContainerClasses extends StObject {
    
    /** Styles applied to the root element if `disableGutters={true}`. */
    var disableGutters: String
    
    /** Styles applied to the root element if `fixed={true}`. */
    var fixed: String
    
    /** Styles applied to the root element if `maxWidth="lg"`. */
    var maxWidthLg: String
    
    /** Styles applied to the root element if `maxWidth="md"`. */
    var maxWidthMd: String
    
    /** Styles applied to the root element if `maxWidth="sm"`. */
    var maxWidthSm: String
    
    /** Styles applied to the root element if `maxWidth="xl"`. */
    var maxWidthXl: String
    
    /** Styles applied to the root element if `maxWidth="xs"`. */
    var maxWidthXs: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object ContainerClasses {
    
    inline def apply(
      disableGutters: String,
      fixed: String,
      maxWidthLg: String,
      maxWidthMd: String,
      maxWidthSm: String,
      maxWidthXl: String,
      maxWidthXs: String,
      root: String
    ): ContainerClasses = {
      val __obj = js.Dynamic.literal(disableGutters = disableGutters.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], maxWidthLg = maxWidthLg.asInstanceOf[js.Any], maxWidthMd = maxWidthMd.asInstanceOf[js.Any], maxWidthSm = maxWidthSm.asInstanceOf[js.Any], maxWidthXl = maxWidthXl.asInstanceOf[js.Any], maxWidthXs = maxWidthXs.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerClasses]
    }
    
    extension [Self <: ContainerClasses](x: Self) {
      
      inline def setDisableGutters(value: String): Self = StObject.set(x, "disableGutters", value.asInstanceOf[js.Any])
      
      inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthLg(value: String): Self = StObject.set(x, "maxWidthLg", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthMd(value: String): Self = StObject.set(x, "maxWidthMd", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthSm(value: String): Self = StObject.set(x, "maxWidthSm", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthXl(value: String): Self = StObject.set(x, "maxWidthXl", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthXs(value: String): Self = StObject.set(x, "maxWidthXs", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
