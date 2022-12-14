package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.ChildrenClassesSx
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsDialogTitleTypeMapT
import com.olvind.mui.muiMaterial.anon.OmitTypographyTypeMapspanpropsclasses
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogTitleDialogTitleMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Dialog](https://mui.com/material-ui/react-dialog/)
    *
    * API:
    *
    * - [DialogTitle API](https://mui.com/material-ui/api/dialog-title/)
    */
  @JSImport("@mui/material/DialogTitle/DialogTitle", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsDialogTitleTypeMapT, Element] = js.native
  
  type DialogTitleProps[D /* <: ElementType */, P] = OverrideProps[DialogTitleTypeMap[P, D], D]
  
  trait DialogTitleTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & ChildrenClassesSx & OmitTypographyTypeMapspanpropsclasses
  }
  object DialogTitleTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & ChildrenClassesSx & OmitTypographyTypeMapspanpropsclasses): DialogTitleTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogTitleTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogTitleTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (DialogTitleTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & ChildrenClassesSx & OmitTypographyTypeMapspanpropsclasses): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsDialogTitleTypeMapT, Element]
  
  /* This means you don't have to write `default`, but can instead just say `dialogTitleDialogTitleMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsDialogTitleTypeMapT, Element] = default
}
