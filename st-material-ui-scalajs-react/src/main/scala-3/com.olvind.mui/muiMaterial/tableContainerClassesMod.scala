package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.muiMaterialStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableContainerClassesMod {
  
  @JSImport("@mui/material/TableContainer/tableContainerClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/TableContainer/tableContainerClasses", JSImport.Default)
  @js.native
  val default: TableContainerClasses = js.native
  
  inline def getTableContainerUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableContainerUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type TableContainerClassKey = root
  
  trait TableContainerClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String
  }
  object TableContainerClasses {
    
    inline def apply(root: String): TableContainerClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableContainerClasses]
    }
    
    extension [Self <: TableContainerClasses](x: Self) {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
