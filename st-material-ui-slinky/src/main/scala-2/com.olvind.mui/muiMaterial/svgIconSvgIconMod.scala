package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsSvgIconTypeMapsvg
import com.olvind.mui.muiMaterial.anon.FontSize
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgIconSvgIconMod {
  
  /**
    *
    * Demos:
    *
    * - [Icons](https://mui.com/components/icons/)
    * - [Material Icons](https://mui.com/components/material-icons/)
    *
    * API:
    *
    * - [SvgIcon API](https://mui.com/api/svg-icon/)
    */
  /* Inlined (props : DefaultComponentProps<SvgIconTypeMap<{}, 'svg'>> & {}): react.react.<global>.JSX.Element & {  muiName :string} */
  object default {
    
    @scala.inline
    def apply(props: DefaultComponentPropsSvgIconTypeMapsvg): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@mui/material/SvgIcon/SvgIcon", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@mui/material/SvgIcon/SvgIcon", "default.muiName")
    @js.native
    def muiName: String = js.native
    @scala.inline
    def muiName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("muiName")(x.asInstanceOf[js.Any])
  }
  
  type SvgIconProps[D /* <: ReactElement */, P] = OverrideProps[SvgIconTypeMap[P, D], D]
  
  @js.native
  trait SvgIconPropsColorOverrides extends StObject
  
  @js.native
  trait SvgIconPropsSizeOverrides extends StObject
  
  @js.native
  trait SvgIconTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with FontSize = js.native
  }
  object SvgIconTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P with FontSize): SvgIconTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[SvgIconTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class SvgIconTypeMapMutableBuilder[Self <: SvgIconTypeMap[_, _], P, D /* <: ReactElement */] (val x: Self with (SvgIconTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with FontSize): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
