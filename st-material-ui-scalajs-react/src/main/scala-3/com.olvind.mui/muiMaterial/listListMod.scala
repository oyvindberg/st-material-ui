package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendListTypeMapLi
import com.olvind.mui.muiMaterial.anon.Dense
import com.olvind.mui.muiMaterial.anon.ListTypeMapulprops
import com.olvind.mui.muiMaterial.overridableComponentMod.OverridableComponent
import com.olvind.mui.muiMaterial.overridableComponentMod.OverridableTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listListMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Lists](https://mui.com/material-ui/react-list/)
    * - [Transfer List](https://mui.com/material-ui/react-transfer-list/)
    *
    * API:
    *
    * - [List API](https://mui.com/material-ui/api/list/)
    */
  @JSImport("@mui/material/List/List", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsExtendListTypeMapLi, Element] = js.native
  
  type ExtendList[M /* <: OverridableTypeMap */] = OverridableComponent[ExtendListTypeMap[M]]
  
  trait ExtendListTypeMap[M /* <: OverridableTypeMap */] extends StObject {
    
    var defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
    
    var props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & ListTypeMapulprops
  }
  object ExtendListTypeMap {
    
    inline def apply[M /* <: OverridableTypeMap */](
      defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any,
      props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & ListTypeMapulprops
    ): ExtendListTypeMap[M] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendListTypeMap[M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtendListTypeMap[?], M /* <: OverridableTypeMap */] (val x: Self & ExtendListTypeMap[M]) extends AnyVal {
      
      inline def setDefaultComponent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
      ): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & ListTypeMapulprops
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type ListProps[D /* <: ElementType */, P] = OverrideProps[ListTypeMap[P, D], D]
  
  trait ListTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Dense
  }
  object ListTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & Dense): ListTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (ListTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Dense): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsExtendListTypeMapLi, Element]
  
  /* This means you don't have to write `default`, but can instead just say `listListMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsExtendListTypeMapLi, Element] = default
}
