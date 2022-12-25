package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.FontSize
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import com.olvind.mui.muiTypes.mod.OverrideProps
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgIconSvgIconPropsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Omit<@mui/joy.anon.SvgIconPropsSvgIconTypeMapsvgdefaultComp, 'color'> & @mui/joy.anon.62<@mui/joy.anon.SvgIconPropsSvgIconTypeMapsvgdefaultComp> extends std.Function ? std.Omit<@mui/joy.anon.SvgIconPropsSvgIconTypeMapsvgdefaultComp, 'color'> & @mui/joy.anon.62<@mui/joy.anon.SvgIconPropsSvgIconTypeMapsvgdefaultComp> : {[ K in keyof std.Omit<@mui/joy.anon.SvgIconPropsSvgIconTypeMapsvgdefaultComp, 'color'> & @mui/joy.anon.62<@mui/joy.anon.SvgIconPropsSvgIconTypeMapsvgdefaultComp> ]: std.Omit<@mui/joy.anon.SvgIconPropsSvgIconTypeMapsvgdefaultComp, 'color'> & @mui/joy.anon.62<@mui/joy.anon.SvgIconPropsSvgIconTypeMapsvgdefaultComp>[K]} */ trait SvgIconOwnerState extends StObject {
    
    /**
      * The `size` specified explicitly on the instance.
      */
    var instanceFontSize: js.UndefOr[
        OverridableStringUnion[
          "inherit" | "xs3" | "xs2" | "xs" | "sm" | "md" | "lg" | "xl" | "xl2" | "xl3" | "xl4" | "xl5" | "xl6" | "xl7", 
          SvgIconPropsSizeOverrides
        ]
      ] = js.undefined
  }
  object SvgIconOwnerState {
    
    inline def apply(): SvgIconOwnerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SvgIconOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SvgIconOwnerState] (val x: Self) extends AnyVal {
      
      inline def setInstanceFontSize(
        value: OverridableStringUnion[
              "inherit" | "xs3" | "xs2" | "xs" | "sm" | "md" | "lg" | "xl" | "xl2" | "xl3" | "xl4" | "xl5" | "xl6" | "xl7", 
              SvgIconPropsSizeOverrides
            ]
      ): Self = StObject.set(x, "instanceFontSize", value.asInstanceOf[js.Any])
      
      inline def setInstanceFontSizeUndefined: Self = StObject.set(x, "instanceFontSize", js.undefined)
    }
  }
  
  type SvgIconProps[D /* <: ElementType */, P] = OverrideProps[SvgIconTypeMap[P, D], D]
  
  trait SvgIconPropsColorOverrides extends StObject
  
  trait SvgIconPropsSizeOverrides extends StObject
  
  type SvgIconSlot = "root"
  
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