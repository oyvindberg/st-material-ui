package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsSvgIconTypeMapsvg
import com.olvind.mui.muiMaterial.anon.FontSize
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgIconSvgIconMod {
  
  /**
    *
    * Demos:
    *
    * - [Icons](https://mui.com/material-ui/icons/)
    * - [Material Icons](https://mui.com/material-ui/material-icons/)
    *
    * API:
    *
    * - [SvgIcon API](https://mui.com/material-ui/api/svg-icon/)
    */
  /* Inlined (props : DefaultComponentProps<SvgIconTypeMap<{}, 'svg'>> & {}): react.react.<global>.JSX.Element & {  muiName :string} */
  object default {
    
    inline def apply(props: DefaultComponentPropsSvgIconTypeMapsvg): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@mui/material/SvgIcon/SvgIcon", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@mui/material/SvgIcon/SvgIcon", "default.muiName")
    @js.native
    def muiName: String = js.native
    inline def muiName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("muiName")(x.asInstanceOf[js.Any])
  }
  
  type SvgIconProps[D /* <: ElementType */, P] = OverrideProps[SvgIconTypeMap[P, D], D]
  
  trait SvgIconPropsColorOverrides extends StObject
  
  trait SvgIconPropsSizeOverrides extends StObject
  
  trait SvgIconTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & FontSize
  }
  object SvgIconTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & FontSize): SvgIconTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[SvgIconTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SvgIconTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (SvgIconTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & FontSize): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
