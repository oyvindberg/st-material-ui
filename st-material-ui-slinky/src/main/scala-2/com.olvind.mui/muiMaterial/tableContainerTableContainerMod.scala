package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTableContainerTypeM
import com.olvind.mui.muiMaterial.anon.`31`
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableContainerTableContainerMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [TableContainer API](https://mui.com/api/table-container/)
    */
  @JSImport("@mui/material/TableContainer/TableContainer", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTableContainerTypeM, Element] = js.native
  
  type TableContainerProps[D /* <: ReactElement */, P] = OverrideProps[TableContainerTypeMap[P, D], D]
  
  @js.native
  trait TableContainerTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with `31` = js.native
  }
  object TableContainerTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P with `31`): TableContainerTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableContainerTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class TableContainerTypeMapMutableBuilder[Self <: TableContainerTypeMap[_, _], P, D /* <: ReactElement */] (val x: Self with (TableContainerTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with `31`): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsTableContainerTypeM, Element]
  
  /* This means you don't have to write `default`, but can instead just say `tableContainerTableContainerMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsTableContainerTypeM, Element] = default
}
