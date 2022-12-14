package com.olvind.mui.muiMaterial

import com.olvind.mui.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableTableContextMod extends Shortcut {
  
  @JSImport("@mui/material/Table/TableContext", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[TableContextProps]] = js.native
  
  trait TableContextProps extends StObject {
    
    var padding: "default" | "checkbox" | "none"
    
    var size: "default" | "checkbox" | "none"
  }
  object TableContextProps {
    
    inline def apply(padding: "default" | "checkbox" | "none", size: "default" | "checkbox" | "none"): TableContextProps = {
      val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableContextProps]
    }
    
    extension [Self <: TableContextProps](x: Self) {
      
      inline def setPadding(value: "default" | "checkbox" | "none"): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setSize(value: "default" | "checkbox" | "none"): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Context[js.UndefOr[TableContextProps]]
  
  /* This means you don't have to write `default`, but can instead just say `tableTableContextMod.foo` */
  override def _to: Context[js.UndefOr[TableContextProps]] = default
}
