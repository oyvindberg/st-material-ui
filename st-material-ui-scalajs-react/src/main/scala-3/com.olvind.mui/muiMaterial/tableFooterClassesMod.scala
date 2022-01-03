package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.muiMaterialStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableFooterClassesMod {
  
  @JSImport("@mui/material/TableFooter/tableFooterClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/TableFooter/tableFooterClasses", JSImport.Default)
  @js.native
  val default: TableFooterClasses = js.native
  
  inline def getTableFooterUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableFooterUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type TableFooterClassKey = root
  
  trait TableFooterClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String
  }
  object TableFooterClasses {
    
    inline def apply(root: String): TableFooterClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableFooterClasses]
    }
    
    extension [Self <: TableFooterClasses](x: Self) {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
