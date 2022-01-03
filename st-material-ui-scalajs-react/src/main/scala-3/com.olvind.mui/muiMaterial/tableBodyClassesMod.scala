package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.muiMaterialStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableBodyClassesMod {
  
  @JSImport("@mui/material/TableBody/tableBodyClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/TableBody/tableBodyClasses", JSImport.Default)
  @js.native
  val default: TableBodyClasses = js.native
  
  inline def getTableBodyUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableBodyUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type TableBodyClassKey = root
  
  trait TableBodyClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String
  }
  object TableBodyClasses {
    
    inline def apply(root: String): TableBodyClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableBodyClasses]
    }
    
    extension [Self <: TableBodyClasses](x: Self) {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
