package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.muiMaterialStrings.checkbox
import com.olvind.mui.muiMaterial.muiMaterialStrings.none
import com.olvind.mui.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableContextMod extends Shortcut {
  
  @JSImport("@mui/material/Table/TableContext", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[TableContextProps]] = js.native
  
  @js.native
  trait TableContextProps extends StObject {
    
    var padding: com.olvind.mui.muiMaterial.muiMaterialStrings.default | checkbox | none = js.native
    
    var size: com.olvind.mui.muiMaterial.muiMaterialStrings.default | checkbox | none = js.native
  }
  object TableContextProps {
    
    @scala.inline
    def apply(
      padding: com.olvind.mui.muiMaterial.muiMaterialStrings.default | checkbox | none,
      size: com.olvind.mui.muiMaterial.muiMaterialStrings.default | checkbox | none
    ): TableContextProps = {
      val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableContextProps]
    }
    
    @scala.inline
    implicit class TableContextPropsMutableBuilder[Self <: TableContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPadding(value: com.olvind.mui.muiMaterial.muiMaterialStrings.default | checkbox | none): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: com.olvind.mui.muiMaterial.muiMaterialStrings.default | checkbox | none): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Context[js.UndefOr[TableContextProps]]
  
  /* This means you don't have to write `default`, but can instead just say `tableContextMod.foo` */
  override def _to: Context[js.UndefOr[TableContextProps]] = default
}
