//
//  ViewController.m
//  ProgressEncode
//
//  Created by Douglas Severo on 8/9/17.
//  Copyright © 2017 Vortigo. All rights reserved.
//

#import "ViewController.h"
#import "Progress.h"

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view, typically from a nib.
}


- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (IBAction)encodeString:(id)sender {
    _lbEncode.text = [Progress encode:[_txtEncode.text dataUsingEncoding:NSASCIIStringEncoding]];
}

@end
