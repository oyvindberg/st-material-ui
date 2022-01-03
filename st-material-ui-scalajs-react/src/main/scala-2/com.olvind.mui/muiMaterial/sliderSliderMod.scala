package com.olvind.mui.muiMaterial

import com.olvind.mui.muiBase.sliderUnstyledSliderUnstyledMod.ExtendSliderUnstyledTypeMap
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendSliderUnstyle
import com.olvind.mui.muiMaterial.anon.`27`
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.FC
import com.olvind.mui.react.mod.global.JSX.Element
import com.olvind.mui.std.Record
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderSliderMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Slider](https://mui.com/components/slider/)
    *
    * API:
    *
    * - [Slider API](https://mui.com/api/slider/)
    * - inherits [SliderUnstyled API](https://mui.com/api/slider-unstyled/)
    */
  @JSImport("@mui/material/Slider/Slider", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsExtendSliderUnstyle, Element] = js.native
  
  @JSImport("@mui/material/Slider/Slider", "SliderMark")
  @js.native
  val SliderMark: FC[SliderMarkProps] = js.native
  
  @JSImport("@mui/material/Slider/Slider", "SliderMarkLabel")
  @js.native
  val SliderMarkLabel: FC[SliderMarkLabelProps] = js.native
  
  @JSImport("@mui/material/Slider/Slider", "SliderRail")
  @js.native
  val SliderRail: FC[SliderRailProps] = js.native
  
  @JSImport("@mui/material/Slider/Slider", "SliderRoot")
  @js.native
  val SliderRoot: FC[SliderRootProps] = js.native
  
  @JSImport("@mui/material/Slider/Slider", "SliderThumb")
  @js.native
  val SliderThumb: FC[SliderThumbProps] = js.native
  
  @JSImport("@mui/material/Slider/Slider", "SliderTrack")
  @js.native
  val SliderTrack: FC[SliderTrackProps] = js.native
  
  @JSImport("@mui/material/Slider/Slider", "SliderValueLabel")
  @js.native
  val SliderValueLabel: FC[SliderValueLabelProps] = js.native
  
  @JSImport("@mui/material/Slider/Slider", "sliderClasses")
  @js.native
  val sliderClasses: SliderClasses_ = js.native
  
  type SliderClassKey = /* keyof std.NonNullable<@mui/base.anon.PartialSliderUnstyledClasses | undefined & @mui/material.anon.ColorPrimary | undefined & @mui/base.anon.PartialSliderUnstyledClasses | undefined> */ String
  
  type SliderClasses_ = Record[SliderClassKey, String]
  
  type SliderMarkLabelProps = /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@mui/base.anon.MarkLabel | undefined>['markLabel'] */ js.Any
  
  type SliderMarkProps = /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@mui/base.anon.MarkLabel | undefined>['mark'] */ js.Any
  
  type SliderProps[D /* <: ElementType */, P] = OverrideProps[SliderTypeMap[D, P], D]
  
  @js.native
  trait SliderPropsColorOverrides extends StObject
  
  @js.native
  trait SliderPropsSizeOverrides extends StObject
  
  type SliderRailProps = /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@mui/base.anon.MarkLabel | undefined>['rail'] */ js.Any
  
  type SliderRootProps = /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@mui/base.anon.MarkLabel | undefined>['root'] */ js.Any
  
  type SliderThumbProps = /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@mui/base.anon.MarkLabel | undefined>['thumb'] */ js.Any
  
  type SliderTrackProps = /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@mui/base.anon.MarkLabel | undefined>['track'] */ js.Any
  
  type SliderTypeMap[D /* <: ElementType */, P] = ExtendSliderUnstyledTypeMap[`27`[P, D]]
  
  type SliderValueLabelProps = /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@mui/base.anon.MarkLabel | undefined>['valueLabel'] */ js.Any
  
  type _To = js.Function1[/* props */ DefaultComponentPropsExtendSliderUnstyle, Element]
  
  /* This means you don't have to write `default`, but can instead just say `sliderSliderMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsExtendSliderUnstyle, Element] = default
}
