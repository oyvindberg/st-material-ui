package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Animation
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsSkeletonTypeMapspan
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  type SkeletonProps[D /* <: ElementType */, P] = OverrideProps[SkeletonTypeMap[P, D], D]
  
  trait SkeletonPropsVariantOverrides extends StObject
  
  trait SkeletonTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Animation
  }
  object SkeletonTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & Animation): SkeletonTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkeletonTypeMap[P, D]]
    }
    
    extension [Self <: SkeletonTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (SkeletonTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Animation): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsSkeletonTypeMapspan, Element]
  
  /* This means you don't have to write `default`, but can instead just say `skeletonSkeletonMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsSkeletonTypeMapspan, Element] = default
}
