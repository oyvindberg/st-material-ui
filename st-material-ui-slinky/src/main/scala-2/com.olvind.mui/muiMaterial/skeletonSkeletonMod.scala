package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Animation
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsSkeletonTypeMapspan
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonSkeletonMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Skeleton](https://mui.com/components/skeleton/)
    *
    * API:
    *
    * - [Skeleton API](https://mui.com/api/skeleton/)
    */
  @JSImport("@mui/material/Skeleton/Skeleton", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsSkeletonTypeMapspan, Element] = js.native
  
  type SkeletonProps[D /* <: ReactElement */, P] = OverrideProps[SkeletonTypeMap[P, D], D]
  
  @js.native
  trait SkeletonPropsVariantOverrides extends StObject
  
  @js.native
  trait SkeletonTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with Animation = js.native
  }
  object SkeletonTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P with Animation): SkeletonTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkeletonTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class SkeletonTypeMapMutableBuilder[Self <: SkeletonTypeMap[_, _], P, D /* <: ReactElement */] (val x: Self with (SkeletonTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with Animation): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsSkeletonTypeMapspan, Element]
  
  /* This means you don't have to write `default`, but can instead just say `skeletonSkeletonMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsSkeletonTypeMapspan, Element] = default
}
