package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsListSubheaderTypeMa
import com.olvind.mui.muiMaterial.anon.DisableSticky
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listSubheaderListSubheaderMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Lists](https://mui.com/components/lists/)
    *
    * API:
    *
    * - [ListSubheader API](https://mui.com/api/list-subheader/)
    */
  @JSImport("@mui/material/ListSubheader/ListSubheader", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsListSubheaderTypeMa, Element] = js.native
  
  type ListSubheaderProps[D /* <: ElementType */, P] = OverrideProps[ListSubheaderTypeMap[P, D], D]
  
  @js.native
  trait ListSubheaderTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with DisableSticky = js.native
  }
  object ListSubheaderTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ElementType */](defaultComponent: D, props: P with DisableSticky): ListSubheaderTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListSubheaderTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class ListSubheaderTypeMapMutableBuilder[Self <: ListSubheaderTypeMap[_, _], P, D /* <: ElementType */] (val x: Self with (ListSubheaderTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with DisableSticky): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsListSubheaderTypeMa, Element]
  
  /* This means you don't have to write `default`, but can instead just say `listSubheaderListSubheaderMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsListSubheaderTypeMa, Element] = default
}
