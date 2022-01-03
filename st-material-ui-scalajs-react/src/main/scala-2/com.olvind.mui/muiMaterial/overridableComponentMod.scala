package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.`26`
import com.olvind.mui.muiMaterial.muiMaterialStrings.className
import com.olvind.mui.muiMaterial.muiMaterialStrings.classes
import com.olvind.mui.muiMaterial.muiMaterialStrings.style
import com.olvind.mui.muiMaterial.stylesMod.StyledComponentProps
import com.olvind.mui.muiTypes.mod.DistributiveOmit
import com.olvind.mui.react.mod.CSSProperties
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overridableComponentMod {
  
  type BaseProps[M /* <: OverridableTypeMap */] = (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) with CommonProps
  
  @js.native
  trait CommonProps
    extends StObject
       with StyledComponentProps[scala.Nothing] {
    
    var className: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object CommonProps {
    
    @scala.inline
    def apply(): CommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonProps]
    }
    
    @scala.inline
    implicit class CommonPropsMutableBuilder[Self <: CommonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type DefaultComponentProps[M /* <: OverridableTypeMap */] = BaseProps[M] with (DistributiveOmit[
    ComponentPropsWithRef[
      /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
    ], 
    /* keyof @mui/material.@mui/material/OverridableComponent.BaseProps<M> */ className | style | classes
  ])
  
  type OverridableComponent[M /* <: OverridableTypeMap */] = js.Function1[/* props */ DefaultComponentProps[M] with `26`, Element]
  
  @js.native
  trait OverridableTypeMap extends StObject {
    
    var defaultComponent: ElementType = js.native
  }
  object OverridableTypeMap {
    
    @scala.inline
    def apply(defaultComponent: ElementType): OverridableTypeMap = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverridableTypeMap]
    }
    
    @scala.inline
    implicit class OverridableTypeMapMutableBuilder[Self <: OverridableTypeMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: ElementType): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    }
  }
  
  type OverrideProps[M /* <: OverridableTypeMap */, C /* <: ElementType */] = BaseProps[M] with (DistributiveOmit[
    ComponentPropsWithRef[C], 
    /* keyof @mui/material.@mui/material/OverridableComponent.BaseProps<M> */ className | style | classes
  ])
}
