package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.ChildrenClassesSx
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTableBodyTypeMaptbo
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableBodyTableBodyMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [TableBody API](https://mui.com/api/table-body/)
    */
  @JSImport("@mui/material/TableBody/TableBody", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTableBodyTypeMaptbo, Element] = js.native
  
  type TableBodyProps[D /* <: ElementType */, P] = OverrideProps[TableBodyTypeMap[P, D], D]
  
  @js.native
  trait TableBodyTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with ChildrenClassesSx = js.native
  }
  object TableBodyTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ElementType */](defaultComponent: D, props: P with ChildrenClassesSx): TableBodyTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableBodyTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class TableBodyTypeMapMutableBuilder[Self <: TableBodyTypeMap[_, _], P, D /* <: ElementType */] (val x: Self with (TableBodyTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with ChildrenClassesSx): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsTableBodyTypeMaptbo, Element]
  
  /* This means you don't have to write `default`, but can instead just say `tableBodyTableBodyMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsTableBodyTypeMaptbo, Element] = default
}
