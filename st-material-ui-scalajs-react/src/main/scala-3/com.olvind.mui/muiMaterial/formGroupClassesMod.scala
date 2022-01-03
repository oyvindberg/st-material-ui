package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formGroupClassesMod {
  
  @JSImport("@mui/material/FormGroup/formGroupClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/FormGroup/formGroupClasses", JSImport.Default)
  @js.native
  val default: FormGroupClasses = js.native
  
  inline def getFormGroupUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormGroupUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.row
  */
  trait FormGroupClassKey extends StObject
  
  trait FormGroupClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `row={true}`. */
    var row: String
  }
  object FormGroupClasses {
    
    inline def apply(root: String, row: String): FormGroupClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormGroupClasses]
    }
    
    extension [Self <: FormGroupClasses](x: Self) {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRow(value: String): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
}
